/// Angular 15.x​​​​​​‌​‌​​‌‌‌‌‌‌‌​​‌‌​‌‌‌​‌​‌‌ code
import { Component, Input, NgModule, Output, EventEmitter } from '@angular/core';
import { CommonModule } from '@angular/common'; // Import CommonModule

@Component({
  selector: 'display-component',
  template: `
    <div>
      <voter-component
        [question]="question"
        [yesAnswer]="yesAnswer"
        [noAnswer]="noAnswer"
        (output)="handleVote($event)"
      ></voter-component>
      <div id="lastVote">
        <p *ngIf="lastVote !== null">{{ lastVote ? yesAnswer : noAnswer }}</p>
      </div>
    </div>
  `,
})
export class DisplayComponent {
  public question = 'Too easy?';
  public yesAnswer = 'Yes';
  public noAnswer = 'No';
  public lastVote: boolean = null;

  handleVote(vote: boolean): void {
    this.lastVote = vote;
  }
}

// VoterComponent: do not change
@Component({
  selector: 'voter-component',
  template: `
    {{ question }}
    <button (click)="vote(true)">{{ yesAnswer }}</button>
    <button (click)="vote(false)">{{ noAnswer }}</button>
  `,
})
export class VoterComponent {
  @Input() public question: string;
  @Input() public yesAnswer: string;
  @Input() public noAnswer: string;

  @Output() public output = new EventEmitter<boolean>();

  public vote(vote: boolean): void {
    this.output.emit(vote);
  }
}

// #region Preview

@Component({
  template: `<display-component></display-component>`,
})
export class PreviewComponent {}

// #endregion Preview

// #region Module declaration - Do not Change
@NgModule({
  declarations: [PreviewComponent, DisplayComponent, VoterComponent],
  entryComponents: [PreviewComponent],
  imports: [CommonModule], // Add CommonModule to imports
})
export class PreviewModule {}
// #endregion Module declaration