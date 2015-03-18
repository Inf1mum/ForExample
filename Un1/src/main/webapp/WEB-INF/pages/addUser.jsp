<div class="container pt-70">
  <div class="row">
    <div class="col-md-8 col-md-offset-2">
      <div class="well well-sm">
        <form class="form-horizontal" action="/email" method="POST" commandName="emailDto">
          <fieldset>
            <legend class="text-center">Create user</legend>
            <div class="form-group">
              <label class="col-md-3 control-label" for="topic">Name</label>
              <div class="col-md-9">
                <input id="topic" name="topic" type="text" placeholder="Enter name"
                       class="form-control"/>
              </div>
            </div>
            <div class="form-group">
              <label class="col-md-3 control-label" for="topic">Surname</label>
              <div class="col-md-9">
                <input id="topic" name="topic" type="text" placeholder="Enter surname"
                       class="form-control"/>
              </div>
            </div>
            <div class="form-group">
              <label class="col-md-3 control-label" for="topic">Login</label>
              <div class="col-md-9">
                <input id="topic" name="topic" type="text" placeholder="Enter login"
                       class="form-control"/>
              </div>
            </div>
            <div class="form-group">
              <label class="col-md-3 control-label" for="topic">Password</label>
              <div class="col-md-9">
                <input id="topic" name="topic" type="text" placeholder="Enter password"
                       class="form-control"/>
              </div>
            </div>
            <div class="form-group">
              <label class="col-md-3 control-label" for="topic">Email</label>
              <div class="col-md-9">
                <input id="topic" name="topic" type="email" placeholder="Enter email"
                       class="form-control"/>
              </div>
            </div>
            <div class="form-group" >
              <div class="col-md-1 col-md-offset-5 ">
                <button type="submit" class="btn btn-primary"><span class="glyphicon glyphicon-plus"></span> Add</button>
              </div>
              <div class="col-md-1 col-md-offset-1">
                <button type="submit" class="btn btn-primary"><span class="glyphicon glyphicon-remove"></span> Delete</button>
              </div>
              <div class="col-md-1 col-md-offset-1 ">
                <button type="submit" class="btn btn-primary"><span class="glyphicon glyphicon-floppy-disk"></span> Save edit</button>
              </div>
            </div>
          </fieldset>
        </form>
      </div>
    </div>
  </div>
</div>
