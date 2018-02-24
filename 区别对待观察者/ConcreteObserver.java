package 区别对待观察者;

import java.util.Vector;
/**
 * 具体的观察者
 * @author Administrator
 *
 */
public class ConcreteObserver implements Observer {
	//订阅者订阅的天气
	private Vector<String> vSubscribeContent;
	private String observerName;
	//订阅者从目标对象中收到的天气信息
	private String tianQi;
	/**
	 * 实例化具体的观察者时,给构造方法传入一个Vector<String>
	 * 此Vector<String>时观察者订阅天气的内容
	 * @param vSubscribeContent
	 */
	public ConcreteObserver(Vector<String> vSubscribeContent) {
		this.vSubscribeContent=vSubscribeContent;
	}
	@Override
	public void update(WeatherSubject subject) {
		tianQi=((ConcreteWeatherSubject)subject).getWeatherContent();
		System.out.println(observerName+tianQi+"啦！！！");
	}
	@Override
	public void setObserverName(String observerName) {
		this.observerName=observerName;
	}
	@Override
	public String getObserverName() {
		return observerName;
	}
	@Override
	public Vector<String> getSubscribeContent() {
		return vSubscribeContent;
	}
	@Override
	public void setSubscribeContent(Vector<String> vSubscribeContent) {
		this.vSubscribeContent=vSubscribeContent;
	}
	public String getTianQi() {
		return tianQi;
	}
	public void setTianQi(String tianQi) {
		this.tianQi = tianQi;
	}
	
}
