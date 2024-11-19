package main;

import io.github.flbulgarelli.jpa.extras.simple.WithSimplePersistenceUnit;
import models.repositories.RepositorioDeObjects;

public class MainExample implements WithSimplePersistenceUnit {
    private RepositorioDeObjects repositorioDeObjects;

    public static void main(String[] args) {
        MainExample instance = new MainExample();
        instance.impactarEnBase();
    }
    public void impactarEnBase(){
        withTransaction(() -> {
        });
    }
}
