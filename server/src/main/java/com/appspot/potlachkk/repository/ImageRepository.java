package com.appspot.potlachkk.repository;



/*
 * Potlach - Coursea POSA Capstone Project
 * Copyright (C) 2014  KK
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version. 
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 * 
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 * 
 */

import java.util.logging.Logger;

import com.appspot.potlachkk.model.Gift;
import com.appspot.potlachkk.model.GiftImage;

public class ImageRepository extends JDOCrudRepository<GiftImage, Long>{

	
	private static final Logger log = Logger.getLogger(ImageRepository.class.getName());

	public ImageRepository() {
		super(GiftImage.class);
	}
	
}
