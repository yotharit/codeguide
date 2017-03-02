#Code Guiding

##Do One Thing
There is a quote say
>FUNCTIONS SHOULD DO ONE THING. THEY SHOULD DO IT WELL. THEY SHOULD DO IT ONLY.

It's also applied to Computer Programming and as it's can be applied as one method should do one job, you can se the bad example of the bad code down here

'''
public void calculation(){
  double x;
  double ansSq;
  double ansSqr;
  Scanner scan = new Scanner(System.in);
  System.out.print("Insert number to find Square : ");
  x = scan.nextDouble();
  ansSq = Math.pow(x, 2);
  System.out.println("Answer is " +ansSq);
	}
'''

As you see from calculation method it do so many thing we can broke it's down into smaller method that do one job
for example make calPow(double) method to do the math for the Square and getInputNum() method to get the input number
and run() method to run the program.

```
public static double calPow(double x){
  return Math.pow(x, 2);
}
public static double getInputNum(){
  Scanner scan = new Scanner(System.in);
  System.out.print("Insert number to find Square : ");
  return scan.nextDouble();

}

public static void run(){
  System.out.print(calPow(getInputNum()));
}
```

Now you can see that the method do one job.

For the Exercise Following these Link [Exercise](https://github.com/yotharit/codeguide/blob/master/src/doOneThing/Exercise.java).

Reference : P.35 Chapter 3:Function ; Clean Code by Robert C. Martin

##Don't Be Cute

When you named the method, named it specific and described. For example if you name the method for deleting the value
don't name it like "BombTheValue". You don't need to make the method name sound funny because other developer might not
understand your sense of humor. You should name it like "deleteValue" which are easier to understand. Also don't use slang
as the method name. For example "whack" to mean "kill".

```
//Example of bad naming.
public void BombTheValue(){
  ...
}
//Good naming.
public void deleteValue(){
  ...
}
```

For the Exercise Following these Link [Exercise](https://github.com/yotharit/codeguide/tree/master/src/dontbecute).
Reference : P.26 Chapter 2:Meaningful Name ; Clean Code by Robert C. Martin
