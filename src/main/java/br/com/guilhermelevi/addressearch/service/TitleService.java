package br.com.guilhermelevi.addressearch.service;

import br.com.guilhermelevi.addressearch.api.HttpApi;
import br.com.guilhermelevi.addressearch.mapper.TitleMapper;
import br.com.guilhermelevi.addressearch.model.Title;

public class TitleService {
	
	private final HttpApi httpApi;
	private final TitleMapper mapper;
	
	public TitleService(HttpApi httApi, TitleMapper mapper) {
		this.httpApi = httApi;
		this.mapper = mapper;
	}
	
	public <T extends Title> T searchByName(String name, Class<T> type) throws Exception {
		String json = httpApi.searchMovie(name);
		return mapper.fromJson(json, type);
	}

}
