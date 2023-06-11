package com.uph.proyectdatos.infraestructure.config;

import com.uph.proyectdatos.domain.spi.ClientesPort;
import com.uph.proyectdatos.domain.spi.PedidosPort;
import com.uph.proyectdatos.domain.spi.ProductoPort;
import com.uph.proyectdatos.infraestructure.adapter.ClientesAdapter;
import com.uph.proyectdatos.infraestructure.adapter.PedidosAdapter;
import com.uph.proyectdatos.infraestructure.adapter.ProductosAdapter;
import com.uph.proyectdatos.infraestructure.jpa.mapper.ClientesMapper;
import com.uph.proyectdatos.infraestructure.jpa.mapper.PedidosMapper;
import com.uph.proyectdatos.infraestructure.jpa.mapper.ProductosMapper;
import com.uph.proyectdatos.infraestructure.jpa.repository.ClientesRepository;
import com.uph.proyectdatos.infraestructure.jpa.repository.PedidosRepository;
import com.uph.proyectdatos.infraestructure.jpa.repository.ProductosRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PersistenceConfiguration {

    @Bean
    public PedidosPort getPedidosPort(final PedidosRepository repository, final PedidosMapper mapper) {
        return new PedidosAdapter(repository,mapper);
    }

    @Bean
    public ProductoPort getProductosPort(final ProductosRepository repository, final ProductosMapper mapper) {
        return new ProductosAdapter(repository, mapper);
    }

    @Bean
    public ClientesPort getClientesPort(final ClientesRepository repository,final ClientesMapper mapper ) {
        return new ClientesAdapter(repository,mapper);
    }
}
