package testJunitBiggerSmaller;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class ExecutoraDeTestes {
	public static void main(String[] args) {
		Result resultado = JUnitCore.runClasses(testCompleteBiggerSmaller.class);
		for (Failure failure : resultado.getFailures()) {
			System.out.println(failure.toString());
		}
		System.out.println(resultado.wasSuccessful());
	}
}