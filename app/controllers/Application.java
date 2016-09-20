package controllers;

import play.*;
import play.mvc.*;

import java.util.*;

import models.*;

public class Application extends Controller {

    public static void index(String nom) {
	String prenom ="Balia";
        render(nom,prenom);
    }
	public static void bonjour(String nom, String prenom){
		render(nom,prenom);
	}
}
