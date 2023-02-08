package by.academy.homework7.task3;

import org.junit.runner.Description;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import org.junit.runner.notification.RunListener;

public class OurListener extends RunListener {

	boolean isHelp;
	public OurListener () {
		super();
		isHelp = true;
	}

	@Override
	public void testFailure(Failure failure) throws Exception {
		isHelp = false;
	}

	@Override
	public void testFinished(Description description) throws Exception {
		if(isHelp) {
			System.out.println("Тест " + description.getMethodName() + " успешно выполнен.");
		}
		isHelp = true;
	}


}
