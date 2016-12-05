/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shampan.db.collections.builder;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.shampan.db.collections.PhotoCategoryDAO;

/**
 *
 * @author Sampan-IT
 */
public class PhotoCategoryDAOBuilder {

    private PhotoCategoryDAO photoCategory;

    public PhotoCategoryDAOBuilder() {
        photoCategory = new PhotoCategoryDAO();
    }
    private String _id;
    private String categoryId;
    private String title;

    public PhotoCategoryDAOBuilder setId(String _id) {
        this._id = _id;
        return this;
    }

    public PhotoCategoryDAOBuilder setCategoryId(String categoryId) {
        this.categoryId = categoryId;
        return this;
    }

    public PhotoCategoryDAOBuilder setTitle(String title) {
        this.title = title;
        return this;
    }

    public PhotoCategoryDAO build() {
        photoCategory.setCategoryId(categoryId);
        photoCategory.setTitle(title);
        return photoCategory;
    }

    public PhotoCategoryDAO build(String daoContent) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            photoCategory = mapper.readValue(daoContent, PhotoCategoryDAO.class);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return photoCategory;
    }

   
}
