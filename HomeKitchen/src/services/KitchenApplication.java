package services;

import java.util.Set;
import java.util.HashSet;

import javax.ws.rs.core.Application;

import services.KitchenModule;
import services.Kitchen;
import com.google.inject.Guice;
import com.google.inject.Injector;

public class KitchenApplication extends Application {
	private Set<Object> singeltons = new HashSet<Object>();
	private Set<Class<?>> empty = new HashSet<Class<?>>();
	
	public TaskManagerApplication(){
		Injector injector = Guice.createInjector(new TaskManagerModule());
		this.singeltons.add(injector.getInstance(TaskManager.class));
	} 
	
	public Set<Class<?>> getClasses(){
		return empty;
	}
	
	public Set<Object> getSingletons(){
		return this.singeltons;
	}
}
