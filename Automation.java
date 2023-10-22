public void LearningWaits() 
	{
		WebDriverManager.chromedriver().setup(); 
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://chercher.tech/practice/implicit-wait-example");	

	
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(12));
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='q']/input[1]")));
		
		driver.findElement(By.xpath("//div[@id='q']/input[1]")).click();
		
		
	}
