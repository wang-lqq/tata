package 区别对待观察者;

import java.util.ArrayList;
import java.util.List;
/**
 * 目标抽象类
 * @author Administrator
 *
 */
public abstract class WeatherSubject {
	//用来保存注册的观察者对象
	public List<Observer> observers=new ArrayList<Observer>();
	//attach detach abstract notifyobservers
	//把订阅天气的人（观察者）添加到（观察者）订阅者列表中
	public void attach(Observer observer) {
		observers.add(observer);
	}
	//删除集合中指定的观察者
	public void detach(Observer observer) {
		observers.remove(observer);
	}
	//protected受保护的方法，只有子类能调用(实现)
	protected abstract void notifyobservers();
}
