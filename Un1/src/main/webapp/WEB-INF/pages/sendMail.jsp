<div class="container pt">
  <div class="row">
    <div class="col-md-6 col-md-offset-3">
      <div class="well well-sm">
        <form class="form-horizontal" action="/email" method="POST" commandName="emailDto">
          <fieldset>
            <legend class="text-center">Send message</legend>
            <div class="form-group">
              <label class="col-md-3 control-label" for="topic">Topic</label>

              <div class="col-md-9">
                <input id="topic" name="topic" type="text" placeholder="Message topic"
                       class="form-control"/>
              </div>
            </div>

            <div class="form-group">
              <label class="col-md-3 control-label" for="message">Your message</label>

              <div class="col-md-9">
                                <textarea class="form-control" id="message" name="message"
                                          placeholder="Please enter your message here..." rows="5"></textarea>
              </div>
            </div>

            <div class="form-group">
              <div class="col-md-12 text-right">
                <button type="submit" class="btn btn-primary">Submit</button>
              </div>
            </div>
          </fieldset>
        </form>
      </div>
    </div>
  </div>
</div>