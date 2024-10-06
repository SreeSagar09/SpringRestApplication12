package com.app.controller;

import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/app")
public class ApplicationController {	
	
	@RequestMapping(path = "/handlerMethod1")
	public ResponseEntity<String> handlerMethod1(@RequestHeader String header){
		ResponseEntity<String> responseEntity = null;
		try {
			responseEntity = new ResponseEntity<String>(header, HttpStatus.OK);
		} catch (Exception e) {
			responseEntity = new ResponseEntity<String>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return responseEntity;
	}
	
	@RequestMapping(path = "/handlerMethod2")
	public ResponseEntity<String> handlerMethod2(@RequestHeader(name = "header") String value){
		ResponseEntity<String> responseEntity = null;
		try {
			responseEntity = new ResponseEntity<String>(value, HttpStatus.OK);
		} catch (Exception e) {
			responseEntity = new ResponseEntity<String>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return responseEntity;
	}
	
	@RequestMapping(path = "/handlerMethod3")
	public ResponseEntity<String> handlerMethod3(@RequestHeader(value = "header") String value){
		ResponseEntity<String> responseEntity = null;
		try {
			responseEntity = new ResponseEntity<String>(value, HttpStatus.OK);
		} catch (Exception e) {
			responseEntity = new ResponseEntity<String>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return responseEntity;
	}
	
	@RequestMapping(path = "/handlerMethod4")
	public ResponseEntity<String[]> handlerMethod4(@RequestHeader(name = "header") String[] headers){
		ResponseEntity<String[]> responseEntity = null;
		try {
			responseEntity = new ResponseEntity<String[]>(headers, HttpStatus.OK);
		} catch (Exception e) {
			responseEntity = new ResponseEntity<String[]>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return responseEntity;
	}
	
	@RequestMapping(path = "/handlerMethod5")
	public ResponseEntity<Map<String, Object>> handlerMethod5(@RequestHeader Map<String, Object> headerMap){
		ResponseEntity<Map<String, Object>> responseEntity = null;
		try {
			responseEntity = new ResponseEntity<Map<String, Object>>(headerMap, HttpStatus.OK);
		} catch (Exception e) {
			responseEntity = new ResponseEntity<Map<String, Object>>(headerMap, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return responseEntity;
	}
	
	@RequestMapping(path = "/handlerMethod6")
	public ResponseEntity<MultiValueMap<String, Object>> handlerMethod6(@RequestHeader MultiValueMap<String, Object> headerMap){
		ResponseEntity<MultiValueMap<String, Object>> responseEntity = null;
		try {
			responseEntity = new ResponseEntity<MultiValueMap<String, Object>>(headerMap, HttpStatus.OK);
		} catch (Exception e) {
			responseEntity = new ResponseEntity<MultiValueMap<String, Object>>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return responseEntity;
	}
	
	@RequestMapping(path = "/handlerMethod7")
	public ResponseEntity<Map<String, Object>> handlerMethod7(@RequestHeader HttpHeaders httpHeaders){
		ResponseEntity<Map<String, Object>> responseEntity = null;
		try {
			Map<String, Object> headerMap = new LinkedHashMap<>();

			httpHeaders.forEach((t, u) ->{headerMap.put(t, u);});

			responseEntity = new ResponseEntity<Map<String, Object>>(headerMap, HttpStatus.OK);
		} catch (Exception e) {
			responseEntity = new ResponseEntity<Map<String, Object>>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return responseEntity;
	}
	
	@RequestMapping(path = "/handlerMethod8")
	public ResponseEntity<String> handlerMethod8(@RequestHeader(required = false) String header){
		ResponseEntity<String> responseEntity = null;
		try {
			responseEntity = new ResponseEntity<String>(header, HttpStatus.OK);
		} catch (Exception e) {
			responseEntity = new ResponseEntity<String>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return responseEntity;
	}
	
	@RequestMapping(path = "/handlerMethod9")
	public ResponseEntity<String> handlerMethod9(@RequestHeader(defaultValue = "No Request Header") String header){
		ResponseEntity<String> responseEntity = null;
		try {
			responseEntity = new ResponseEntity<String>(header, HttpStatus.OK);
		} catch (Exception e) {
			responseEntity = new ResponseEntity<String>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return responseEntity;
	}
}
