package com.arantes.sale.adapters.in.controller.mapper;

import com.arantes.sale.adapters.in.controller.request.SaleRequest;
import com.arantes.sale.application.core.domain.Sale;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-02-10T18:37:55-0300",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.1 (Oracle Corporation)"
)
@Component
public class SaleRequestMapperImpl implements SaleRequestMapper {

    @Override
    public Sale toSale(SaleRequest saleRequest) {
        if ( saleRequest == null ) {
            return null;
        }

        Sale sale = new Sale();

        sale.setProductId( saleRequest.getProductId() );
        sale.setUserId( saleRequest.getUserId() );
        sale.setValue( saleRequest.getValue() );
        sale.setQuantity( saleRequest.getQuantity() );

        return sale;
    }
}
