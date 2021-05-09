declare i32 @printf(i8*, ...)
declare i32 @__isoc99_scanf(i8*, ...)
@strpi = constant [4 x i8] c"%d\0A\00"
@strpd = constant [4 x i8] c"%f\0A\00"
@strs = constant [3 x i8] c"%d\00"
@.string = private constant [4 x i8] c"%s\0A\00"
@x = global i32 0
define i32 @fun() nounwind {
%1 = load i32, i32* @x
%2 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strpi, i32 0, i32 0), i32 %1)
%x = alloca i32
store i32 3, i32* %x
%3 = load i32, i32* %x
%4 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strpi, i32 0, i32 0), i32 %3)
%fun = alloca i32
store i32 0, i32* %fun
%5 = load i32, i32* %fun
ret i32 %5
}
define i32 @main() nounwind{
%1 = call i32 (i8*, ...) @__isoc99_scanf(i8* getelementptr inbounds ([3 x i8], [3 x i8]* @strs, i32 0, i32 0), i32* @x)
%2 = call i32 @fun()
ret i32 0 }
