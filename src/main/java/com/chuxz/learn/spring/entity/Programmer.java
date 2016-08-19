package com.chuxz.learn.spring.entity;

import java.util.Collection;
import java.util.Map;

public class Programmer {
	
	private Collection<Language> languages;
	private Map<String, Language> lang;
	private Language language;
	
	
	public void setLanguage(Language language) {
		this.language = language;
	}
	
	public void saying(){
		System.out.println("saying " +language.using());
	}

	public void working() {
		for(Language lan:languages){
			System.out.println("working on "+lan.using());
		}
	}
	
	public void studing() {
		for(String key:lang.keySet()){
			Language lan = lang.get(key);
			System.out.println("studing on "+lan.using());
		}
		
	}
	public Collection<Language> getLanguages() {
		return languages;
	}
	public void setLanguages(Collection<Language> languages) {
		this.languages = languages;
	}
	public Map<String, Language> getLang() {
		return lang;
	}
	public void setLang(Map<String, Language> lang) {
		this.lang = lang;
	}

}
