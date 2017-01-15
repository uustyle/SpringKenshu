package jp.co;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component
public class AppPropertyBean {

	   // ①@Valueでプロパティキーと変数を紐づけ
    @Value("${app.user.id}")
    private String id;
    
    @Value("${app.user.name}")
    private String name;
    
    @Value("${TESTENV}")
    private String testenv;
    
    public String getId(){
        return id;
    }
    
    public String getName(){
        return name;
    }

	public String getTestenv() {
		return testenv;
	}

	public void setTestenv(String testenv) {
		this.testenv = testenv;
	}
}
