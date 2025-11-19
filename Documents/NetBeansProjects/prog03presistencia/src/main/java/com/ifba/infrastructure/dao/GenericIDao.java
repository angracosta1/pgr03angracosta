/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ifba.infrastructure.dao;

import com.ifba.infrastructure.entity.PersistenceEntity;
import java.util.List;

/**
 *
 * @author angra
 */
public interface GenericIDao <Entity extends PersistenceEntity> {
    
    public abstract Entity save(Entity obj);
    public abstract Entity update(Entity obj);
    public abstract void delete(Entity obj);
    public abstract Entity findById(Long id);
    public abstract List<Entity> findAll();
    
}