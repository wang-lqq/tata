package 区别对待观察者;

import java.util.Vector;

/**
 * 实现目标抽象类,具体的目标类
 * @author Administrator
 *
 */
public class ConcreteWeatherSubject extends WeatherSubject {
	//"晴天" "下雨" "下雪"
	//目标对象的状态
	private String weatherContent;
	
	
	public String getWeatherContent() {
		return weatherContent;
	}


	public void setWeatherContent(String weatherContent) {
		this.weatherContent = weatherContent;
		//通知所有订阅者
		this.notifyobservers();
	}
	/**
	 * 循环每一个观察者,并判断观察者订阅的是什么:1.晴天2.下雨3.下雪
	 * @param tianQi
	 */
	public void tongZhi(String tianQi) {
		//循环遍历每一个观察者
		for (Observer observer :observers) {
			//订阅者订阅的天气跟实际的天气比较
			Vector<String> vdingYue=((ConcreteObserver)observer).getSubscribeContent();
			for (String s: vdingYue) {
				if(s.equals(tianQi)) {
					observer.update(this);
				}
			}
		}
	}
	@Override
	protected void notifyobservers() {
		if(weatherContent.equals("下雨")) {
			tongZhi(weatherContent);
		}else if(weatherContent.equals("下雪")) {
			tongZhi(weatherContent);
		}else if(weatherContent.equals("晴天")) {
			tongZhi(weatherContent);
		}
		
	}

}
