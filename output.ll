declare i32 @printf(i8*, ...)
declare i32 @__isoc99_scanf(i8*, ...)
@strpi = constant [4 x i8] c"%d\0A\00"
@strpd = constant [4 x i8] c"%f\0A\00"
@strs = constant [3 x i8] c"%d\00"
@.string = private constant [4 x i8] c"%s\0A\00"
@x = global i32 0
define i32 @main() nounwind{
store i32 1, i32* @x
%1 = load i32, i32* @x
%2 = icmp eq i32 1, 3
br i1 %2, label %truea1, label %falsea1
truea1:
%3 = load i32, i32* @x
%4 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strpi, i32 0, i32 0), i32 %3)
br label %falsea1
falsea1:
ret i32 0 }
