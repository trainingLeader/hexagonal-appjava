package com.hexagonaljava;

import com.hexagonaljava.application.usecase.client.ClientUseCase;
import com.hexagonaljava.domain.repository.ClientRespository;
import com.hexagonaljava.infrastructure.database.ConnectionFactory;
import com.hexagonaljava.infrastructure.persistence.client.ClientRepositoryImpl;

public class Main {
    public static void main(String[] args) {
        ClientRespository repositorio = new ClientRepositoryImpl(ConnectionFactory.crearConexion());
        ClientUseCase clienteCasoUso = new ClientUseCase(repositorio);
    }
}