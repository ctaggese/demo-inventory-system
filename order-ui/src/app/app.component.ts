import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { ApiModule } from './api/api.module';
import { CommonModule, NgFor } from '@angular/common';
@Component({
  selector: 'app-root',
  standalone: true,
  imports: [RouterOutlet,CommonModule,NgFor],
  templateUrl: './app.component.html',
  styleUrl: './app.component.scss'
})
export class AppComponent {
  title = 'order-ui';
}
