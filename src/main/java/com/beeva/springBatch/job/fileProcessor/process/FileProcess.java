package com.beeva.springBatch.job.fileProcessor.process;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

import com.beeva.springBatch.job.fileProcessor.modelo.Cliente;
import com.beeva.springBatch.job.fileProcessor.modelo.ClienteCliente;

@Component
public class FileProcess implements ItemProcessor<Cliente, ClienteCliente> {

	public ClienteCliente process(Cliente cli) throws Exception {
		ClienteCliente cliCli = new ClienteCliente();
		cliCli.setNombre(cli.getNombre());
		cliCli.setApellido(cli.getApellido());

		return cliCli;
	}

}
