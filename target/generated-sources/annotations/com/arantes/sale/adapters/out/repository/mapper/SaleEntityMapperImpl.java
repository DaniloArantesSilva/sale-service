package com.arantes.sale.adapters.out.repository.mapper;

import com.arantes.sale.adapters.out.repository.entity.SaleEntity;
import com.arantes.sale.application.core.domain.Sale;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-02-10T18:37:55-0300",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.1 (Oracle Corporation)"
)
@Component
public class SaleEntityMapperImpl implements SaleEntityMapper {

    @Override
    public SaleEntity toSaleEntity(Sale sale) {
        if ( sale == null ) {
            return null;
        }

        SaleEntity saleEntity = new SaleEntity();

        saleEntity.setStatusId( setStatusId( sale.getStatus() ) );
        saleEntity.setId( sale.getId() );
        saleEntity.setProductId( sale.getProductId() );
        saleEntity.setUserId( sale.getUserId() );
        saleEntity.setValue( sale.getValue() );
        saleEntity.setQuantity( sale.getQuantity() );

        return saleEntity;
    }

    @Override
    public Sale toSale(SaleEntity saleEntity) {
        if ( saleEntity == null ) {
            return null;
        }

        Sale sale = new Sale();

        sale.setStatus( setStatus( saleEntity.getStatusId() ) );
        sale.setId( saleEntity.getId() );
        sale.setProductId( saleEntity.getProductId() );
        sale.setUserId( saleEntity.getUserId() );
        sale.setValue( saleEntity.getValue() );
        sale.setQuantity( saleEntity.getQuantity() );

        return sale;
    }
}
