import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { RouterModule } from '@angular/router';
import { CapaComponent } from './capa/capa.component';
import { EncabezadoComponent } from './capa/encabezado/encabezado.component';
import { PrincipalComponent } from './capa/principal/principal.component';
import { PiePaginaComponent } from './capa/pie-pagina/pie-pagina.component';
import { FormsModule } from '@angular/forms';
import { GestionBebidasComponent } from './capa/principal/gestion-bebidas/gestion-bebidas.component';
import { GestionPlatosComponent } from './capa/principal/gestion-platos/gestion-platos.component';
import { GestionClientesComponent } from './capa/principal/gestion-clientes/gestion-clientes.component';
import { GestionFacturasComponent } from './capa/principal/gestion-facturas/gestion-facturas.component';
import { ConsultaBebidasService} from './servicios/consulta-bebidas-servicio/consulta.bebida.service'

@NgModule({
  declarations: [CapaComponent, EncabezadoComponent, PrincipalComponent, PiePaginaComponent, GestionBebidasComponent, GestionPlatosComponent, GestionClientesComponent, GestionFacturasComponent],
  imports: [
    CommonModule,RouterModule,FormsModule
  ],
  exports: [
  	CapaComponent
  ],
  providers: [
    ConsultaBebidasService
      // ConsultaVehiculosService
  ]
})
export class NucleoModule { }