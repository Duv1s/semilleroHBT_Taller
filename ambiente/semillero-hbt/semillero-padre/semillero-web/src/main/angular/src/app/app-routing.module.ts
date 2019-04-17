import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { PrincipalComponent } from './nucleo/capa/principal/principal.component';
import { GestionBebidasComponent } from './nucleo/capa/principal/gestion-bebidas/gestion-bebidas.component';
import { GestionPlatosComponent} from './nucleo/capa/principal/gestion-platos/gestion-platos.component';
import { GestionClientesComponent} from './nucleo/capa/principal/gestion-clientes/gestion-clientes.component';
import { GestionFacturasComponent} from './nucleo/capa/principal/gestion-facturas/gestion-facturas.component';

const routes: Routes = [
  {
    path: 'componente-principal',
    component: PrincipalComponent
  },
  {
    path: 'gestion-bebidas',
    component: GestionBebidasComponent
  },
  {
    path: 'gestion-platos',
    component: GestionPlatosComponent
  },
  {
    path: 'gestion-clientes',
    component: GestionClientesComponent
  },
  {
    path: 'gestion-facturas',
    component: GestionFacturasComponent
  },

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
