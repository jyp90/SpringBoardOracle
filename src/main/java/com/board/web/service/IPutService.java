package com.board.web.service;

import java.util.Map;

@org.springframework.stereotype.Service
@FunctionalInterface
public interface IPutService {
	public int execute(Map<?,?> map) throws Exception;
}
