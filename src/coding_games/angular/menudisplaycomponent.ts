// Angular 15.x code
import { Component, Input, NgModule } from '@angular/core';
import {APP_BASE_HREF} from '@angular/common';
import { RouterModule, Routes } from '@angular/router';

@Component({
  selector:'menu1-component',
  template: `
    <div id="menuComp">You are at menu 1.</div>
  `
})
export class Menu1Component {
}

@Component({
  selector:'menu2-component2',
  template: `
    <div id="menuComp">You are at menu 2.</div>
  `
})
export class Menu2Component {
}

@Component({
  selector:'menu-display-component',
  template: `
  <a id="menu2" routerLink="/menu2">
    menu2
  </a>

  <a id="menu1" routerLink="/menu1">
    menu1
  </a>
  <section class="content">
      <router-outlet></router-outlet>
    </section>
  `
})
export class MenuDisplayComponent {
}

export const appRoutes :Routes = [
  {
      path: 'menu1',
      component: Menu1Component,
      title: 'menu1 component'
  },

  { path: 'menu2',
   component: Menu2Component,
   title: 'menu2 component' },


]


// #region Preview
@Component({
    template: `
      <menu-display-component></menu-display-component>
    `
})
export class PreviewComponent { }
// #endregion Preview


// #region Module declaration - Do not Change
@NgModule({
  imports: [RouterModule.forRoot(appRoutes, {useHash: true})],
  exports: [RouterModule]
})
export class AppRoutingModule {
}

@NgModule({
    imports: [
      RouterModule,
      AppRoutingModule
    ],
    declarations: [PreviewComponent, Menu1Component, Menu2Component, MenuDisplayComponent],
    entryComponents: [PreviewComponent],
    providers: [{provide: APP_BASE_HREF, useValue : '/'}]
})
export class PreviewModule { }