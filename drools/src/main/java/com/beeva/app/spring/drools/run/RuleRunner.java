package com.beeva.app.spring.drools.run;

import org.drools.runtime.StatelessKnowledgeSession;

public class RuleRunner {

	private StatelessKnowledgeSession ksession;

	private String ruleFile;

	public RuleRunner() {
	}
		

	public void setKsession(StatelessKnowledgeSession ksession) {
		this.ksession = ksession;
	}


	public void runRules(Object fact) throws Exception {
		System.out.println("Loading file: " + ruleFile);
		ksession.execute(fact);
	}

	public String getRuleFile() {
		return ruleFile;
	}

	public void setRuleFile(String ruleFile) {
		this.ruleFile = ruleFile;
	}
}