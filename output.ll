declare i32 @printf(i8*, ...)
declare i32 @__isoc99_scanf(i8*, ...)
@strpi = constant [4 x i8] c"%d\0A\00"
@strpd = constant [4 x i8] c"%f\0A\00"
@strs = constant [3 x i8] c"%d\00"
@.string = private constant [4 x i8] c"%s\0A\00"
@a = global i32 0
@test.x = global i32 0
@test.y = global i32 0
@testowy.x = global i32 0
@testowy.y = global i32 0
define i32 @main() nounwind{
store i32 3, i32* @a
store i32 4, i32* @test.x
store i32 2, i32* @testowy.y
%1 = call i32 (i8*, ...) @__isoc99_scanf(i8* getelementptr inbounds ([3 x i8], [3 x i8]* @strs, i32 0, i32 0), i32* @test.y)
%2 = load i32, i32* @test.y
%3 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strpi, i32 0, i32 0), i32 %2)
%4 = load i32, i32* @testowy.y
%5 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strpi, i32 0, i32 0), i32 %4)
ret i32 0 }
