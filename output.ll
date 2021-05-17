declare i32 @printf(i8*, ...)
declare i32 @__isoc99_scanf(i8*, ...)
@strpi = constant [4 x i8] c"%d\0A\00"
@strpd = constant [4 x i8] c"%f\0A\00"
@strs = constant [3 x i8] c"%d\00"
@.string = private constant [4 x i8] c"%s\0A\00"
@t.z = global i32 0
define i32 @t.zosia() nounwind {
%w = alloca i32
store i32 33, i32* %w
%1 = load i32, i32* %w
%2 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strpi, i32 0, i32 0), i32 %1)
%t.zosia = alloca i32
store i32 0, i32* %t.zosia
%3 = load i32, i32* %t.zosia
ret i32 %3
}
@y.z = global i32 0
define i32 @y.zosia() nounwind {
%w = alloca i32
store i32 33, i32* %w
%1 = load i32, i32* %w
%2 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strpi, i32 0, i32 0), i32 %1)
%y.zosia = alloca i32
store i32 0, i32* %y.zosia
%3 = load i32, i32* %y.zosia
ret i32 %3
}
define i32 @fun() nounwind {
%x = alloca i32
store i32 3, i32* %x
%1 = load i32, i32* %x
%2 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strpi, i32 0, i32 0), i32 %1)
%fun = alloca i32
store i32 0, i32* %fun
%3 = load i32, i32* %fun
ret i32 %3
}
define i32 @main() nounwind{
store i32 22, i32* @t.z
%1 = load i32, i32* @t.z
%2 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strpi, i32 0, i32 0), i32 %1)
store i32 45, i32* @y.z
%3 = load i32, i32* @y.z
%4 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strpi, i32 0, i32 0), i32 %3)
%5 = call i32 @t.zosia()
%6 = call i32 @y.zosia()
%7 = call i32 @fun()
ret i32 0 }
