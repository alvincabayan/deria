package com.alvincabayan.api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.alvincabayan.model.CurrentMenu;
import com.alvincabayan.service.CurrentMenuService;

@RestController
public class CurrentMenuApiController implements CurrentMenuApi {
	private static final Logger log = LoggerFactory.getLogger(CurrentMenuApiController.class);
	
	@Autowired
	private CurrentMenuService currentMenuService;

	public ResponseEntity<CurrentMenu> getCurrentMenu() {
		CurrentMenu currentMenu = currentMenuService.getCurrentMenu();

		return new ResponseEntity<CurrentMenu>(currentMenu, HttpStatus.OK);
	}
}
