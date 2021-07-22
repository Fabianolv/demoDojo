package com.dojo.demoDojo.controller;

import com.dojo.demoDojo.entidades.Pessoa;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
public class PessoaController {

    private List<Pessoa> pessoas;

    // para acessar, devemos fazer um GET em http://localhost:8080/pessoas
    @GetMapping(path = "/pessoas")
    public ResponseEntity<List<Pessoa>> buscarPessoas(){

        // Retorne a String Danilo com o codigo de OK => 200
        // return ResponseEntity.ok("Danilo");

        // Retorna toda a lista de pessoa
        return ResponseEntity.ok(pessoas);
    }

    // para acessar, devemos fazer um POST em http://localhost:8080/pessoas com um body =
    // {
    //    "nome": "Val",
    //    "endereco": "R Prof Tavares Paes"
    // }
    @PostMapping(path = "/pessoas")
    public ResponseEntity<String> cadastrarPessoa(@RequestBody Pessoa pessoa){

        //adiciona pessoa
        pessoas.add(pessoa);

        return ResponseEntity.ok().build();
    }

    @PutMapping("/pessoas")
    public ResponseEntity<String> alterarPessoa(@RequestBody Pessoa pessoa) {
        // Codigo que altera Pessoa

        return ResponseEntity.ok().build();
    }
    @DeleteMapping("/pessoas")
    public ResponseEntity<String> deletarPessoa(@RequestBody Pessoa pessoa) {
        return ResponseEntity.ok().build();
    }
}
