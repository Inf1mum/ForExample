<div class="container pt-70">
  <div class="row">
    <div class="col-md-6 col-md-offset-3">
      <div class="well well-sm">
        <form class="form-horizontal" action="/email" method="POST" commandName="emailDto">
          <legend class="text-center">Feedback</legend>
          <div class="form-group">
            <label class="col-md-3 control-label" for="message">Your feedback</label>
            <div class="col-md-9">
                                <textarea class="form-control" id="message" name="message"
                                          placeholder="Please enter your feedback here..." rows="5"></textarea>
            </div>
          </div>
          <div class="form-group">
            <div class="col-md-12 text-right">
              <button type="submit" class="btn btn-primary">Submit</button>
            </div>
          </div>

        </form>
      </div>
    </div>
  </div>
</div>
