import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { PlaygroundListComponent } from './playground-list/playground-list.component';

import { HttpClientModule } from '@angular/common/http'
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { FormsModule} from '@angular/forms';
import { NotfoundComponent } from './notfound/notfound.component';
import { CreatePlaygroundComponent } from './create-playground/create-playground.component';
import { PlaygroundDetailsComponent } from './playground-details/playground-details.component';
import { UpdatePlaygroundComponent } from './update-playground/update-playground.component';



@NgModule({
  declarations: [
    AppComponent,
    PlaygroundListComponent,
    NotfoundComponent,
    CreatePlaygroundComponent,
    PlaygroundDetailsComponent,
    UpdatePlaygroundComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    FormsModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
