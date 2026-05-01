package com.example.lab04_20230420.controller;

import ch.qos.logback.core.model.Model;
import com.example.lab04_20230420.repository.CeldaBackupRepository;
import com.example.lab04_20230420.repository.CeldaRepository;
import com.example.lab04_20230420.repository.EstadoJuegoRepository;
import com.example.lab04_20230420.repository.MaderaRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.example.lab04_20230420.entity.tableroInicialBackup;
import com.example.lab04_20230420.entity.confJuego;

@Controller
public class CacatuaController {
    private final CeldaBackupRepository celdaBackupRepository;
    private final EstadoJuegoRepository estadoJuegoRepository;
    private final CeldaRepository celdaRepository;
    private final MaderaRepository maderaRepository;

    public CacatuaController(CeldaBackupRepository cb, EstadoJuegoRepository e, MaderaRepository m, CeldaRepository c) {
        this.celdaBackupRepository = cb;
        this.estadoJuegoRepository = e;
        this.maderaRepository = m;
        this.celdaRepository = c;
    }

    @GetMapping("/")
    public String inicio(){
        return "redirect:/cacatua_sulfurea";
    }

    @GetMapping("/cacatua_sulfurea")
    public String juego(@RequestParam(required = false) String direccion,
                        @RequestParam(required = false) String reiniciar,
                        Model model){
        if (reiniciar != null){
            reiniciarJuego();
        } else if (direccion != null){
            procesarMovimiento(direccion)
        }
        cargarModelo(model)
    }
    private void procesarMovimiento(String direccion){
        confJuego Juego = new confJuego();
    }
    private void reiniciarJuego(){
        confJuego Juego = new confJuego();

    }
    private void cargarModelo(Model model){}

}
