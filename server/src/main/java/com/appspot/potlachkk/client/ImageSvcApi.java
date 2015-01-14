package com.appspot.potlachkk.client;



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

import retrofit.http.Multipart;
import retrofit.http.POST;
import retrofit.http.Part;
import retrofit.mime.TypedFile;

//Retrofit Interface used for testing and compliance 
public interface ImageSvcApi {
	public static final String IMG_SVC_PATH = "/image";

	public static final String IMG_SVC_PATH_ID = "/image/{id}";
	
	@Multipart
	@POST(IMG_SVC_PATH)
	public Long addImage(@Part("imageData") TypedFile imageFile);

}
