
package com.swagger.services;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.swagger.GatewaySwaggerResource;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.apache.tomcat.util.http.fileupload.IOUtils;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Controller;
import springfox.documentation.swagger.web.SwaggerResource;

@Controller
@RequestMapping("/admin/api/")
public class DocumentController {

   /* @Autowired
    private GatewaySwaggerResource swaggerResourceProvider;

    @Value("${documentation.docType}")
    private String docType;

    @Value("${documentation.reports}")
    private String report_path;

    @Value("${documentation.allDocs}")
    private String zipFile;

    @Value("${server.port}")
    private String port;

    @Value("${documentation.baseurl}")
    private String host;

    @RequestMapping(value = "/", method = RequestMethod.GET, produces = "application/json")
    @ApiOperation(value = "/", nickname = "traps", notes = "This operation allow user to get all service documents from the swagger aggregator.", response = Object.class)
    @ApiResponses(value = {
        @ApiResponse(code = 200, message = "Success", response = Object.class),
	@ApiResponse(code = 401, message = "Unauthorized"),@ApiResponse(code = 403, message = "Forbidden"),
	@ApiResponse(code = 404, message = "Not Found"), @ApiResponse(code = 500, message = "Failure")})
    public List<DocumentResponse> documents() {
        List<DocumentResponse> documentList = new ArrayList<>();
        List<SwaggerResource> swaggerResources = swaggerResourceProvider.get();
        String apiPath = host + ":" + port + "/api/1.0/swagger/documents/download/";
        swaggerResources.forEach((resorce) -> {
            String filename = resorce.getName() + "-" + resorce.getSwaggerVersion() + "." + docType;
            String href = apiPath + filename + "/";
            documentList.add(new DocumentResponse(resorce.getName(), resorce.getSwaggerVersion(), href));
        });
        documentList.add(new DocumentResponse("Complete API documents", "1.0", apiPath + zipFile + "/"));
        return documentList;
    }

    @RequestMapping(value = "/download/{filename}/", method = RequestMethod.GET)
    @ApiOperation(value = "/download/{filename}/", nickname = "download", notes = "This operation allow user to download api pdf document from swagger aggregator.")
    @ResponseBody
    public String download(HttpServletResponse response, @PathVariable String filename) {
        try {
            if (filename.trim().equalsIgnoreCase(zipFile)) {
                response.setContentType("application/zip");
            } else {
                response.setContentType("application/pdf");
            }
            Path filePath = FileSystems.getDefault().getPath(report_path, filename);
            FileInputStream is = new FileInputStream(filePath.toFile());
            IOUtils.copy(is, response.getOutputStream());
            response.setHeader("Content-Disposition", "attachment; filename=" + filename);
            response.flushBuffer();
            return "Successfully downloaded :" + filename;
        } catch (IOException ex) {
            //throw new RuntimeException("IOError writing file to output stream");
            return "Document  generation is still in progress. Please try the download after 5 minutes.";
        }
    }*/

}
