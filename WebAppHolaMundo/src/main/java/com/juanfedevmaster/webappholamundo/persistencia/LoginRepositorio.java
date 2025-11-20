/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.juanfedevmaster.webappholamundo.persistencia;

import com.juanfedevmaster.webappholamundo.modelos.Login;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import org.bson.Document;

/**
 *
 * @author jufeq
 */
public class LoginRepositorio {
    private MongoDatabase database;
    private MongoCollection<Document> loginCollection;

    public LoginRepositorio() {
        var client = MongoClients.create("mongodb+srv://juanquintanag_db_user:JJyjvokYTVyqwIRV@202502.sb5e63y.mongodb.net/");
        database = client.getDatabase("TiendaDonChepe");
        loginCollection = database.getCollection("Login");
    }
    
    public Login getUsuario(String email){
        Document doc = loginCollection.find(Filters.eq("email", email)).first();
        if(doc == null)
            return null;
        
        return Login.fromDocument(doc);
    }
}
