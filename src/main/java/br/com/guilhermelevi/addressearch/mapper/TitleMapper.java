package br.com.guilhermelevi.addressearch.mapper;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import br.com.guilhermelevi.addressearch.model.Title;

public class TitleMapper {
	
	private final Gson gson;
	
	public TitleMapper() {
		this.gson = new GsonBuilder()
				.setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
				.create();
	}
	
	public <T extends Title>T fromJson(String json, Class<T> type) {
		return gson.fromJson(json, type);
	}

}
