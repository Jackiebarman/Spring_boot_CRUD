import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { PlaygroundListComponent } from './playground-list/playground-list.component';
import { NotfoundComponent } from './notfound/notfound.component';
import { CreatePlaygroundComponent } from './create-playground/create-playground.component';
import { PlaygroundDetailsComponent } from './playground-details/playground-details.component';
import { UpdatePlaygroundComponent } from './update-playground/update-playground.component';
const routes: Routes = [
  {path:'',redirectTo:'getPlayground',pathMatch:"full"},
  {path:'getPlayground',component:PlaygroundListComponent},
  {path:'create-playground',component:CreatePlaygroundComponent},
  {path: 'playground-details/:id', component: PlaygroundDetailsComponent},
  {path: 'update-playground/:id',component:UpdatePlaygroundComponent},
  {path:'**',component:NotfoundComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
