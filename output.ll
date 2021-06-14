declare i32 @printf(i8*, ...)
declare i32 @__isoc99_scanf(i8*, ...)
@strpi = constant [4 x i8] c"%d\0A\00"
@strpd = constant [4 x i8] c"%f\0A\00"
@strs = constant [3 x i8] c"%d\00"
@.string = private constant [4 x i8] c"%s\0A\00"
@a = global i32 0
define i32 @fun() nounwind {
%1 = load i32, i32* @a
%2 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strpi, i32 0, i32 0), i32 %1)
%a = alloca i32
store i32 3, i32* %a
%3 = load i32, i32* %a
%4 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strpi, i32 0, i32 0), i32 %3)
%fun = alloca i32
store i32 0, i32* %fun
%5 = load i32, i32* %fun
ret i32 %5
}
@z = global double 0.0
@x = global double 0.0
@y = global i32 0
@b = global i32 0
@test.x = global i32 0
@test.y = global i32 0
@test.z = global i32 0
@t.x = global i32 0
@t.y = global i32 0
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
define i32 @main() nounwind{
store i32 2, i32* @a
%1 = sitofp i32 3 to double
%2 = fsub double %1, 5.0
store double %2, double* @z
%3 = load double, double* @z
%4 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strpd, i32 0, i32 0), double %3)
%5 = sitofp i32 8 to double
%6 = fadd double %5, 2.2
store double %6, double* @x
%7 = load double, double* @x
%8 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strpd, i32 0, i32 0), double %7)
store i32 3, i32* @y
%9 = load i32, i32* @y
%10 = icmp eq i32 %9, 3
br i1 %10, label %truea1, label %falsea1
truea1:
%11 = load i32, i32* @y
%12 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strpi, i32 0, i32 0), i32 %11)
br label %falsea1
falsea1:
%13 = call i32 (i8*, ...) @__isoc99_scanf(i8* getelementptr inbounds ([3 x i8], [3 x i8]* @strs, i32 0, i32 0), i32* @b)
%14 = alloca i32
store i32 0, i32* %14
br label %cond1
cond1:
%15 = load i32, i32* %14
%16 = add i32 %15, 1
store i32 %16, i32* %14
%17 = icmp slt i32 %15, 3
br i1 %17, label %true1, label %false1
true1:
%18 = load i32, i32* @b
%19 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strpi, i32 0, i32 0), i32 %18)
br label %cond1
false1:
store i32 4, i32* @test.x
%20 = call i32 (i8*, ...) @__isoc99_scanf(i8* getelementptr inbounds ([3 x i8], [3 x i8]* @strs, i32 0, i32 0), i32* @test.y)
%21 = load i32, i32* @test.y
%22 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strpi, i32 0, i32 0), i32 %21)
%23 = call i32 @fun()
%24 = load i32, i32* @a
%25 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strpi, i32 0, i32 0), i32 %24)
store i32 22, i32* @t.z
%26 = load i32, i32* @t.z
%27 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strpi, i32 0, i32 0), i32 %26)
%28 = call i32 @t.zosia()
ret i32 0 }
