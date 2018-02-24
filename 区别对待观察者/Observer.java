package 区别对待观察者;

import java.util.Vector;

/**
 * 观察者接口
 * 定义一个更新的接口方法,给那些在目标发生改变的时候,被通知的观察者对象调用
 * @author Administrators
 *
 */
public interface Observer {
	/**
	 * 更新接口
	 * @param subject
	 */
	public void update(WeatherSubject subject);
	/**
	 * 设置观察者名称
	 * @param observerName
	 */
	public void setObserverName(String observerName);
	/**
	 * 取得观察者名称
	 * @return
	 */
	public String getObserverName();
	/**
	 * 取得观察者订阅订阅的内容
	 * @return
	 */
	public Vector<String> getSubscribeContent();
	/**
	 * 设置观察者订阅订阅的内容
	 * @param subscribeContent
	 */
	public void setSubscribeContent(Vector<String> vSubscribeContent);
}
