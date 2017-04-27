package com.beeva.app.spring.batch.main;

import java.util.HashMap;
import java.util.Map;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobParameter;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(new String[] {
				"spring/batch/beans/batch-flat-file-context.xml",
				"spring/batch/jobs/job-flat-file.xml"});
		
		JobLauncher jobLauncher = (JobLauncher) context.getBean("jobLauncher");
		Job job = (Job) context.getBean("job1");

		try {
			Map <String, JobParameter> params = new HashMap<String, JobParameter>();
			params.put("param1", new JobParameter("value1"));
			
			JobExecution execution = jobLauncher.run(job, new JobParameters(params));
			System.out.println("Exit Status : " + execution.getStatus());

		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("Done");
		((AbstractApplicationContext) context).close();
	}

}
