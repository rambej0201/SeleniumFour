package com.dss;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\SOFTWARES\\JAVA\\CHROMEDRIVER_WIN32\\CHROMEDRIVER.EXE");
		WebDriver d = new ChromeDriver();
		
		d.get("https://www.24hourfitness.com/");
		d.findElement(By.xpath("//*[@id='locations']")).click();
		System.out.println(d.getCurrentUrl());
		System.out.println(d.getTitle());
		System.out.println("------------------------");
		d.findElement(By.xpath("//*[@id='searchLocation']/div/form/input")).sendKeys("95051");
		System.out.println(d.getCurrentUrl());
		System.out.println(d.getTitle());
		System.out.println("------------------------");
		d.findElement(By.xpath("//*[@id='searchLocation']/div/form/button")).click();
		System.out.println(d.getCurrentUrl());
		System.out.println(d.getTitle());
		System.out.println("------------------------");
		Thread.sleep(5000);
		d.findElement(By.xpath("//*[@id='classes']")).click();
		System.out.println(d.getCurrentUrl());
		System.out.println(d.getTitle());
		System.out.println("------------------------");
		d.findElement(By.xpath("//*[@id='page-content']/div/div[2]/section/section/div[3]/div/div/div/a")).click();
		System.out.println(d.getCurrentUrl());
		System.out.println(d.getTitle());
		System.out.println("------------------------");
		d.findElement(By.xpath("//*[@id='page-content']/div/section[1]/section/form/input[1]")).sendKeys("95131");
		System.out.println(d.getCurrentUrl());
		System.out.println(d.getTitle());
		System.out.println("------------------------");
		d.findElement(By.xpath("//*[@id='page-content']/div/section[1]/section/form/button")).click();
		System.out.println(d.getCurrentUrl());
		System.out.println(d.getTitle());
		System.out.println("------------------------");
		d.findElement(By.xpath("//*[@id='at-811']")).click();
		Thread.sleep(2000);
		System.out.println(d.getCurrentUrl());
		System.out.println(d.getTitle());
		System.out.println("------------------------");
		
		d.findElement(By.xpath("//*[@id='locations']")).click();
		System.out.println(d.getCurrentUrl());
		System.out.println(d.getTitle());
		System.out.println("------------------------");
		//d.findElement(By.xpath("//*[@id='page-content']/div[3]/div[1]/div/a")).click();
		//d.findElement(By.xpath("//*[@id='at-888']")).click();
		Thread.sleep(2000);
		System.out.println(d.getCurrentUrl());
		System.out.println(d.getTitle());
		System.out.println("------------------------");
		
		d.findElement(By.xpath("//*[@id='training-about']")).click();
		System.out.println(d.getCurrentUrl());
		System.out.println(d.getTitle());
		System.out.println("------------------------");
		d.findElement(By.xpath("//*[@id='page-content']/div/section[1]/section[4]/div/div[1]/a")).click();
		System.out.println(d.getCurrentUrl());
		System.out.println(d.getTitle());
		System.out.println("------------------------");
		d.findElement(By.xpath("//*[@id='fullWidth']/div[2]/form/input[3]")).sendKeys("92121");
		System.out.println(d.getCurrentUrl());
		System.out.println(d.getTitle());
		System.out.println("------------------------");
		d.findElement(By.xpath("//*[@id='fullWidth']/div[2]/form/button")).click();
		Thread.sleep(2000);
		System.out.println(d.getCurrentUrl());
		System.out.println(d.getTitle());
		System.out.println("------------------------");
		
		d.findElement(By.xpath("//*[@id='gym-membership']")).click();
		System.out.println(d.getCurrentUrl());
		System.out.println(d.getTitle());
		System.out.println("------------------------");
		d.findElement(By.xpath("//*[@id='page-content']/div/section[1]/section[3]/div/div[2]/a")).click();
		System.out.println(d.getCurrentUrl());
		System.out.println(d.getTitle());
		System.out.println("------------------------");
		d.findElement(By.xpath("//a[@href='#current_location']")).click();
		System.out.println(d.getCurrentUrl());
		System.out.println(d.getTitle());
		System.out.println("------------------------");
		
		d.get("https://www.24hourfitness.com/membershipSalesOnline/pos/large?execution=e2s1");
		System.out.println(d.getCurrentUrl());
		System.out.println(d.getTitle());
		System.out.println("------------------------");
//		d.findElement(By.xpath("//*[@id=\"p-556\"]/img")).click();
//		System.out.println(d.getCurrentUrl());
//		System.out.println(d.getTitle());
//		System.out.println("------------------------");
		Thread.sleep(5000);
		d.close();

	}

}
