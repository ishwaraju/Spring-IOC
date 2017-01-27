package beans;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextClosedEvent;

public class IOCCloseEvent implements ApplicationListener<ContextClosedEvent> {

	@Override
	public void onApplicationEvent(ContextClosedEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("on close events");
	}

}
