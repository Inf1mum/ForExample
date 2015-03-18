<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<div class="container pt-70">
  <div class="row">
    <div class="col-md-5 col-md-offset-4">
      <ul id="myTab" class="nav nav-tabs bd">
        <li class="active"><a href="#students" data-toggle="tab"><span class="glyphicon glyphicon-th-list">  Students</a></li>
        <li><a href="#tutors" data-toggle="tab"><span class="glyphicon glyphicon-th-list">  Tutors</a></li>
        <li><a href="#feedbacks" data-toggle="tab"><span class="glyphicon glyphicon-th-list">  Feedbacks</a></li>
      </ul>
    </div>
  </div>
</div>


<div id="myTabContent" class="tab-content">
  <div class="tab-pane active" id="students">
    <div class="container">
      <div class="row">
        <div class="col-md-8 col-md-offset-2">
          <div class="well well-sm  pt-20">
            <table class="table table-striped pt ">
              <thead >
              <tr>
                <th>#</th>
                <th>First Name</th>
                <th>Last Name</th>
                <th>Username</th>
                <th></th>
              </tr>
              </thead>
              <tbody>
              <tr>
                <td>1</td>
                <td>Mark</td>
                <td>Otto</td>
                <td>@mdo</td>
                <td align="right"><button type="submit" class="btn btn-primary"><span class="glyphicon glyphicon-edit"></span> Edit</button></td>
              </tr>
              <tr>
                <td>2</td>
                <td>Jacob</td>
                <td>Thornton</td>
                <td>@fat</td>
                <td align="right"><button type="submit" class="btn btn-primary"><span class="glyphicon glyphicon-edit"></span> Edit</button></td>
              </tr>
              <tr>
                <td>3</td>
                <td>Larry</td>
                <td>the Bird</td>
                <td>@twitter</td>
                <td align="right"><button type="submit" class="btn btn-primary"><span class="glyphicon glyphicon-edit"></span> Edit</button></td>
              </tr>
              </tbody>
            </table>
            <div class="row pt=70">
              <div class="col-md-12 text-right">
                <button type="submit" class="btn btn-primary"><span class="glyphicon glyphicon-plus"></span> Add student</button>
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>
  </div>
  <div class="tab-pane" id="tutors">

    <div class="container">
      <div class="row">
        <div class="col-md-8 col-md-offset-2">
          <div class="well well-sm  pt-20">
            <table class="table table-striped ">
              <thead >
              <tr>
                <th>#</th>
                <th>First Name</th>
                <th>Last Name</th>
                <th>Username</th>
                <th></th>
              </tr>
              </thead>
              <tbody>
              <tr>
                <td>1</td>
                <td>Mark</td>
                <td>Otto</td>
                <td>@mdo</td>
                <td align="right"><button type="submit" class="btn btn-primary"><span class="glyphicon glyphicon-edit"></span> Edit</button></td>
              </tr>
              <tr>
                <td>2</td>
                <td>Jacob</td>
                <td>Thornton</td>
                <td>@fat</td>
                <td align="right"><button type="submit" class="btn btn-primary"><span class="glyphicon glyphicon-edit"></span> Edit</button></td>
              </tr>
              <tr>
                <td>3</td>
                <td>Larry</td>
                <td>the Bird</td>
                <td>@twitter</td>
                <td align="right"><button type="submit" class="btn btn-primary"><span class="glyphicon glyphicon-edit"></span> Edit</button></td>
              </tr>
              </tbody>
            </table>
            <div class="row pt=70">
              <div class="col-md-12 text-right">
                <button type="submit" class="btn btn-primary"><span class="glyphicon glyphicon-plus"></span> Add tutor</button>
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>
  </div>
  <div class="tab-pone" id="feedbacks">

  </div>
</div>

<!-- JavaScript Includes -->
<script src="<c:url value="/resources/js/jquery.min.js"/> "></script>
<script src="<c:url value="/resources/js/bootstrap.min.js"/> "></script>
<script src="<c:url value="/resources/js/tab.js"/> "></script>
<script src="<c:url value="/resources/js/transition.js"/> "></script>

