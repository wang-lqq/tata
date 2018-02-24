package 区别对待观察者;

import java.util.Vector;

public class Client {

	public static void main(String[] args) {
		//创建具体的目标对象
		ConcreteWeatherSubject tianQi=new ConcreteWeatherSubject();
		
		//创建具体的观察者对象
		Vector<String> vDingYue1=new Vector<String>();
		vDingYue1.add("下雨");
		vDingYue1.add("下雪");
		ConcreteObserver guanChaZhe1=new ConcreteObserver(vDingYue1);
		guanChaZhe1.setObserverName("王明");
		
		Vector<String> vDingYue2=new Vector<String>();
		vDingYue2.add("下雪");
		ConcreteObserver guanChaZhe2=new ConcreteObserver(vDingYue2);
		guanChaZhe2.setObserverName("黄明");
		
		//注册订阅者到订阅者列表中
		tianQi.attach(guanChaZhe1);
		tianQi.attach(guanChaZhe2);
		
		//更新天气,并通知订阅者(观察者)
		tianQi.setWeatherContent("下雪");
	}

}
