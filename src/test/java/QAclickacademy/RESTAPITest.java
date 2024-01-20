package QAclickacademy;

import org.testng.annotations.Test;

public class RESTAPITest {

	@Test
	public void postJira()
	{
		System.out.println("postJira");
	}
	
	@Test
	public void deleteTwitter()
	{
		System.out.println("deleteTwitter");
	}
	
	
}

/* So now there are two types of executions.
So one time, you want to run only smoke
and another time, you want to run only regression.
So how do you control that XML file's execution from your Maven?
If that is the criteria, we will build profiles in pom.xml
One profile name will be <id>Regression</id>
And in this Regression I want to include all the test cases So for that, there is one XML file ready for me, which does that, which is nothing but testng2.
ok? so these profile is specifically run Regression tests

And on the other profile  <id>Smoke</id> to run only smoke test
So now from command prompt, I can control which test I decide to run: Regression or Smoke test
Writing mvn test -P (P stands for profile) and the name of your profile

mvn test -PRegression or

 mvn test -PSmoke

*/

















