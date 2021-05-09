import java.util.Arrays;
import java.util.Stack;

class LLVMGenerator{
   
   static String header_text = "";
   static String main_text = "";
   static String buffer = "";
   static int reg = 1;
   static int main_reg = 1;
   static int br = 0;
   static int br_if = 0;

   static Stack<Integer> brstack = new Stack<>();
   static Stack<Integer> brstack_if = new Stack<>();

   static void repeatstart(String repetitions){
      declare_r(Integer.toString(reg));
      int counter = reg;
      reg++;
      assign_i32("%"+counter, "0");
      br++;
      buffer += "br label %cond"+br+"\n";
      buffer += "cond"+br+":\n";

      load("%"+counter);
      add("%"+(reg-1), "1");
      assign("%"+counter, "%"+(reg-1));

      buffer += "%"+reg+" = icmp slt i32 %"+(reg-2)+", "+repetitions+"\n";
      reg++;

      buffer += "br i1 %"+(reg-1)+", label %true"+br+", label %false"+br+"\n";
      buffer += "true"+br+":\n";
      brstack.push(br);
   }

   static void icmp(String id, String value)
   {
      buffer += "%"+reg+" = load i32, i32* "+id+"\n";
      reg++;
      buffer += "%"+reg+" = icmp eq i32 "+(reg-1)+", "+value+"\n";
      reg++;
   }

   static void ifstart()
   {
      br_if++;
      buffer += "br i1 %"+(reg-1)+", label %truea"+br_if+", label %falsea"+br_if+"\n";
      buffer += "truea"+br_if+":\n";
      brstack_if.push(br_if);
   }

   static void ifend()
   {
      int b = brstack_if.pop();
      buffer += "br label %falsea"+b+"\n";
      buffer += "falsea"+b+":\n";
   }

   static void repeatend(){
      int b = brstack.pop();
      buffer += "br label %cond"+b+"\n";
      buffer += "false"+b+":\n";
   }

   static void assign(String id, String value){
      buffer += "store i32 "+value+", i32* "+id+"\n";
   }

   static void load(String id){
     buffer += "%"+reg+" = load i32, i32* "+id+"\n";
     reg++;
   }

   static void add(String val1, String val2){
      buffer += "%"+reg+" = add i32 "+val1+", "+val2+"\n";
      reg++;
   }
   static void load_i32(String id){
      buffer += "%"+reg+" = load i32, i32* "+id+"\n";
      reg++;
   }

   static void printf_i32(String id){
      buffer += "%"+reg+" = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strpi, i32 0, i32 0), i32 %"+(reg-1)+")\n";
      reg++;
   }

   static void printf_double(String id){
      buffer += "%"+reg+" = load double, double* "+id+"\n";
      reg++;
      buffer += "%"+reg+" = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strpd, i32 0, i32 0), double %"+(reg-1)+")\n";
      reg++;
   }

   static void declare_double(String id, Boolean global)
   {
      if( global ) {
         header_text += "@"+id+" = global double 0.0\n";
      }else {
         buffer += "%" + id + " = alloca double\n";
      }
   }

   static void assign_i32(String id, String value){
      buffer += "store i32 "+value+", i32* "+id+"\n";
   }

   static void assign_double(String id, String value){
      buffer += "store double "+value+", double* "+id+"\n";
   }

   static void scanf(String id){
      buffer += "%"+reg+" = call i32 (i8*, ...) @__isoc99_scanf(i8* getelementptr inbounds ([3 x i8], [3 x i8]* @strs, i32 0, i32 0), i32* "+id+")\n";
      reg++;
   }

   static void scanf_double(String id){
      buffer += "%"+reg+" = call double (i8*, ...) @__isoc99_scanf(i8* getelementptr inbounds ([3 x i8], [3 x i8]* @strs, double 0, double 0), double* %"+id+")\n";
      reg++;
   }

   static void add_i32(String val1, String val2){
      buffer += "%"+reg+" = add i32 "+val1+", "+val2+"\n";
      reg++;
   }

   static void add_double(String val1, String val2){
      buffer += "%"+reg+" = fadd double "+val1+", "+val2+"\n";
      reg++;
   }

   static void sub_i32(String val1, String val2){
      buffer += "%"+reg+" = sub i32 "+val1+", "+val2+"\n";
      reg++;
   }

   static void sub_double(String val1, String val2){
      buffer += "%"+reg+" = fsub double "+val1+", "+val2+"\n";
      reg++;
   }


   static void sitofp(String id){
      buffer += "%"+reg+" = sitofp i32 "+id+" to double\n";
      reg++;
   }

   static void fptosi(String id){
      buffer += "%"+reg+" = fptosi double "+id+" to i32\n";
      reg++;
   }

   static void functionstart(String id)
   {
      main_text+=buffer;
      main_reg = reg;
      buffer = "define i32 @"+id+"() nounwind {\n";
      reg = 1;
   }

   static void functionend(){
      buffer += "ret i32 %"+(reg-1)+"\n";
      buffer += "}\n";
      header_text += buffer;
      buffer = "";
      reg = main_reg;
   }


   static String generate(){
      String text = "";
      text += "declare i32 @printf(i8*, ...)\n";
      text += "declare i32 @__isoc99_scanf(i8*, ...)\n";
      text += "@strpi = constant [4 x i8] c\"%d\\0A\\00\"\n";
      text += "@strpd = constant [4 x i8] c\"%f\\0A\\00\"\n";
      text += "@strs = constant [3 x i8] c\"%d\\00\"\n";
      text += "@.string = private constant [4 x i8] c\"%s\\0A\\00\"\n";
      //text += const_text;
      text += header_text;
      text += "define i32 @main() nounwind{\n";
      text += main_text;
      text += "ret i32 0 }\n";
      return text;
   }

   static void close_main(){
      main_text += buffer;
   }

   static void declare_i32(String id, Boolean global){
      if( global ){
         header_text += "@"+id+" = global i32 0\n";
      } else {
         buffer += "%"+id+" = alloca i32\n";
      }
   }

   static void declare_r(String id){
      buffer += "%"+id+" = alloca i32\n";
   }

   static void call(String id){
      buffer += "%"+reg+" = call i32 @"+id+"()\n";
      reg++;
   }

   static void declare_string(String id, Boolean global){
      if (global) {
         header_text += "@"+id+" = global [6 x i8] c\"hello0\"\n";
      } else {
         buffer += "%"+id+" = alloca [6 x i8]\n";
      }
   }

   static void declare_array(String id, Boolean global){
      if (global) {
         header_text += "@"+id+" = global [6 x i8] c\"hello0\"\n";
      } else {
         buffer += "%"+id+" = alloca [6 x i8]\n";
      }
   }

   static void assign_string(String id, String value){
      String[] str = new String[6];
      char c = 'a';
      int ascii = 0;
      for (int i = 0; i < 6; i++) {
         if (i < value.length() ) {
            c = value.charAt(i);
            ascii = c;
         }
         else {
            ascii = 0;
         }
         str[i] = "i8 " + String.valueOf(ascii);
      }

      buffer += "store [6 x i8] "+Arrays.toString(str)+", [6 x i8]* "+id+"\n";
   }

   static void assign_array(String id, String value){
      String[] str = new String[6];
      char c = 'a';
      int ascii = 0;
      for (int i = 0; i < 6; i++) {
         if (i < value.length() ) {
            c = value.charAt(i);
            ascii = c;
         }
         else {
            ascii = 0;
         }
         str[i] = "i8 " + String.valueOf(ascii);
      }

      buffer += "store [6 x i8] "+Arrays.toString(str)+", [6 x i8]* "+id+"\n";
   }

   static void printf_string(String id){
      buffer += "%"+reg+" = bitcast [6 x i8]* "+id+" to i8*\n";
      reg++;
      buffer += "%"+reg+" = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @.string, i32 0, i32 0), i8* %"+(reg-1)+")\n";
      reg++;
   }

   static void printf_array(String id){
      buffer += "%"+reg+" = bitcast [6 x i8]* "+id+" to i8*\n";
      reg++;
      buffer += "%"+reg+" = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @.string, i32 0, i32 0), i8* %"+(reg-1)+")\n";
      reg++;
   }
}
