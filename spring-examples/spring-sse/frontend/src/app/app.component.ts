import {Component, inject} from '@angular/core';
import { RouterOutlet } from '@angular/router';
import {Message} from 'primeng/message';
import {MessagesService} from './services/messages.service';

@Component({
  selector: 'app-root',
  imports: [RouterOutlet, Message],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  private readonly messagesService = inject(MessagesService);

  readonly messages = this.messagesService.messages;
}
