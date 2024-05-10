// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PageRuleActionsCacheKeyFieldsUserArgs extends com.pulumi.resources.ResourceArgs {

    public static final PageRuleActionsCacheKeyFieldsUserArgs Empty = new PageRuleActionsCacheKeyFieldsUserArgs();

    /**
     * `true` - classifies a request as “mobile”, “desktop”, or “tablet” based on the User Agent; defaults to `false`.
     * 
     */
    @Import(name="deviceType")
    private @Nullable Output<Boolean> deviceType;

    /**
     * @return `true` - classifies a request as “mobile”, “desktop”, or “tablet” based on the User Agent; defaults to `false`.
     * 
     */
    public Optional<Output<Boolean>> deviceType() {
        return Optional.ofNullable(this.deviceType);
    }

    /**
     * `true` - includes the client’s country, derived from the IP address; defaults to `false`.
     * 
     */
    @Import(name="geo")
    private @Nullable Output<Boolean> geo;

    /**
     * @return `true` - includes the client’s country, derived from the IP address; defaults to `false`.
     * 
     */
    public Optional<Output<Boolean>> geo() {
        return Optional.ofNullable(this.geo);
    }

    /**
     * `true` - includes the first language code contained in the `Accept-Language` header sent by the client; defaults to `false`.
     * 
     * Example:
     * 
     * &lt;!--Start PulumiCodeChooser --&gt;
     * <pre>
     * {@code
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.cloudflare.PageRule;
     * import com.pulumi.cloudflare.PageRuleArgs;
     * import com.pulumi.cloudflare.inputs.PageRuleActionsArgs;
     * import com.pulumi.cloudflare.inputs.PageRuleActionsCacheKeyFieldsArgs;
     * import com.pulumi.cloudflare.inputs.PageRuleActionsCacheKeyFieldsCookieArgs;
     * import com.pulumi.cloudflare.inputs.PageRuleActionsCacheKeyFieldsHeaderArgs;
     * import com.pulumi.cloudflare.inputs.PageRuleActionsCacheKeyFieldsHostArgs;
     * import com.pulumi.cloudflare.inputs.PageRuleActionsCacheKeyFieldsQueryStringArgs;
     * import com.pulumi.cloudflare.inputs.PageRuleActionsCacheKeyFieldsUserArgs;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         // Unrealistic example with all features used
     *         var foobar = new PageRule("foobar", PageRuleArgs.builder()        
     *             .zoneId(cloudflareZoneId)
     *             .target(String.format("%s/app/*", cloudflareZone))
     *             .priority(1)
     *             .actions(PageRuleActionsArgs.builder()
     *                 .cacheKeyFields(PageRuleActionsCacheKeyFieldsArgs.builder()
     *                     .cookie(PageRuleActionsCacheKeyFieldsCookieArgs.builder()
     *                         .checkPresences("wordpress_test_cookie")
     *                         .build())
     *                     .header(PageRuleActionsCacheKeyFieldsHeaderArgs.builder()
     *                         .checkPresences("header_present")
     *                         .excludes("origin")
     *                         .includes(                        
     *                             "api-key",
     *                             "dnt")
     *                         .build())
     *                     .host(PageRuleActionsCacheKeyFieldsHostArgs.builder()
     *                         .resolved(true)
     *                         .build())
     *                     .queryString(PageRuleActionsCacheKeyFieldsQueryStringArgs.builder()
     *                         .ignore(true)
     *                         .build())
     *                     .user(PageRuleActionsCacheKeyFieldsUserArgs.builder()
     *                         .deviceType(false)
     *                         .geo(true)
     *                         .lang(true)
     *                         .build())
     *                     .build())
     *                 .build())
     *             .build());
     * 
     *     }
     * }
     * }
     * </pre>
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    @Import(name="lang")
    private @Nullable Output<Boolean> lang;

    /**
     * @return `true` - includes the first language code contained in the `Accept-Language` header sent by the client; defaults to `false`.
     * 
     * Example:
     * 
     * &lt;!--Start PulumiCodeChooser --&gt;
     * <pre>
     * {@code
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.cloudflare.PageRule;
     * import com.pulumi.cloudflare.PageRuleArgs;
     * import com.pulumi.cloudflare.inputs.PageRuleActionsArgs;
     * import com.pulumi.cloudflare.inputs.PageRuleActionsCacheKeyFieldsArgs;
     * import com.pulumi.cloudflare.inputs.PageRuleActionsCacheKeyFieldsCookieArgs;
     * import com.pulumi.cloudflare.inputs.PageRuleActionsCacheKeyFieldsHeaderArgs;
     * import com.pulumi.cloudflare.inputs.PageRuleActionsCacheKeyFieldsHostArgs;
     * import com.pulumi.cloudflare.inputs.PageRuleActionsCacheKeyFieldsQueryStringArgs;
     * import com.pulumi.cloudflare.inputs.PageRuleActionsCacheKeyFieldsUserArgs;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         // Unrealistic example with all features used
     *         var foobar = new PageRule("foobar", PageRuleArgs.builder()        
     *             .zoneId(cloudflareZoneId)
     *             .target(String.format("%s/app/*", cloudflareZone))
     *             .priority(1)
     *             .actions(PageRuleActionsArgs.builder()
     *                 .cacheKeyFields(PageRuleActionsCacheKeyFieldsArgs.builder()
     *                     .cookie(PageRuleActionsCacheKeyFieldsCookieArgs.builder()
     *                         .checkPresences("wordpress_test_cookie")
     *                         .build())
     *                     .header(PageRuleActionsCacheKeyFieldsHeaderArgs.builder()
     *                         .checkPresences("header_present")
     *                         .excludes("origin")
     *                         .includes(                        
     *                             "api-key",
     *                             "dnt")
     *                         .build())
     *                     .host(PageRuleActionsCacheKeyFieldsHostArgs.builder()
     *                         .resolved(true)
     *                         .build())
     *                     .queryString(PageRuleActionsCacheKeyFieldsQueryStringArgs.builder()
     *                         .ignore(true)
     *                         .build())
     *                     .user(PageRuleActionsCacheKeyFieldsUserArgs.builder()
     *                         .deviceType(false)
     *                         .geo(true)
     *                         .lang(true)
     *                         .build())
     *                     .build())
     *                 .build())
     *             .build());
     * 
     *     }
     * }
     * }
     * </pre>
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public Optional<Output<Boolean>> lang() {
        return Optional.ofNullable(this.lang);
    }

    private PageRuleActionsCacheKeyFieldsUserArgs() {}

    private PageRuleActionsCacheKeyFieldsUserArgs(PageRuleActionsCacheKeyFieldsUserArgs $) {
        this.deviceType = $.deviceType;
        this.geo = $.geo;
        this.lang = $.lang;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PageRuleActionsCacheKeyFieldsUserArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PageRuleActionsCacheKeyFieldsUserArgs $;

        public Builder() {
            $ = new PageRuleActionsCacheKeyFieldsUserArgs();
        }

        public Builder(PageRuleActionsCacheKeyFieldsUserArgs defaults) {
            $ = new PageRuleActionsCacheKeyFieldsUserArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param deviceType `true` - classifies a request as “mobile”, “desktop”, or “tablet” based on the User Agent; defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder deviceType(@Nullable Output<Boolean> deviceType) {
            $.deviceType = deviceType;
            return this;
        }

        /**
         * @param deviceType `true` - classifies a request as “mobile”, “desktop”, or “tablet” based on the User Agent; defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder deviceType(Boolean deviceType) {
            return deviceType(Output.of(deviceType));
        }

        /**
         * @param geo `true` - includes the client’s country, derived from the IP address; defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder geo(@Nullable Output<Boolean> geo) {
            $.geo = geo;
            return this;
        }

        /**
         * @param geo `true` - includes the client’s country, derived from the IP address; defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder geo(Boolean geo) {
            return geo(Output.of(geo));
        }

        /**
         * @param lang `true` - includes the first language code contained in the `Accept-Language` header sent by the client; defaults to `false`.
         * 
         * Example:
         * 
         * &lt;!--Start PulumiCodeChooser --&gt;
         * <pre>
         * {@code
         * package generated_program;
         * 
         * import com.pulumi.Context;
         * import com.pulumi.Pulumi;
         * import com.pulumi.core.Output;
         * import com.pulumi.cloudflare.PageRule;
         * import com.pulumi.cloudflare.PageRuleArgs;
         * import com.pulumi.cloudflare.inputs.PageRuleActionsArgs;
         * import com.pulumi.cloudflare.inputs.PageRuleActionsCacheKeyFieldsArgs;
         * import com.pulumi.cloudflare.inputs.PageRuleActionsCacheKeyFieldsCookieArgs;
         * import com.pulumi.cloudflare.inputs.PageRuleActionsCacheKeyFieldsHeaderArgs;
         * import com.pulumi.cloudflare.inputs.PageRuleActionsCacheKeyFieldsHostArgs;
         * import com.pulumi.cloudflare.inputs.PageRuleActionsCacheKeyFieldsQueryStringArgs;
         * import com.pulumi.cloudflare.inputs.PageRuleActionsCacheKeyFieldsUserArgs;
         * import java.util.List;
         * import java.util.ArrayList;
         * import java.util.Map;
         * import java.io.File;
         * import java.nio.file.Files;
         * import java.nio.file.Paths;
         * 
         * public class App {
         *     public static void main(String[] args) {
         *         Pulumi.run(App::stack);
         *     }
         * 
         *     public static void stack(Context ctx) {
         *         // Unrealistic example with all features used
         *         var foobar = new PageRule("foobar", PageRuleArgs.builder()        
         *             .zoneId(cloudflareZoneId)
         *             .target(String.format("%s/app/*", cloudflareZone))
         *             .priority(1)
         *             .actions(PageRuleActionsArgs.builder()
         *                 .cacheKeyFields(PageRuleActionsCacheKeyFieldsArgs.builder()
         *                     .cookie(PageRuleActionsCacheKeyFieldsCookieArgs.builder()
         *                         .checkPresences("wordpress_test_cookie")
         *                         .build())
         *                     .header(PageRuleActionsCacheKeyFieldsHeaderArgs.builder()
         *                         .checkPresences("header_present")
         *                         .excludes("origin")
         *                         .includes(                        
         *                             "api-key",
         *                             "dnt")
         *                         .build())
         *                     .host(PageRuleActionsCacheKeyFieldsHostArgs.builder()
         *                         .resolved(true)
         *                         .build())
         *                     .queryString(PageRuleActionsCacheKeyFieldsQueryStringArgs.builder()
         *                         .ignore(true)
         *                         .build())
         *                     .user(PageRuleActionsCacheKeyFieldsUserArgs.builder()
         *                         .deviceType(false)
         *                         .geo(true)
         *                         .lang(true)
         *                         .build())
         *                     .build())
         *                 .build())
         *             .build());
         * 
         *     }
         * }
         * }
         * </pre>
         * &lt;!--End PulumiCodeChooser --&gt;
         * 
         * @return builder
         * 
         */
        public Builder lang(@Nullable Output<Boolean> lang) {
            $.lang = lang;
            return this;
        }

        /**
         * @param lang `true` - includes the first language code contained in the `Accept-Language` header sent by the client; defaults to `false`.
         * 
         * Example:
         * 
         * &lt;!--Start PulumiCodeChooser --&gt;
         * <pre>
         * {@code
         * package generated_program;
         * 
         * import com.pulumi.Context;
         * import com.pulumi.Pulumi;
         * import com.pulumi.core.Output;
         * import com.pulumi.cloudflare.PageRule;
         * import com.pulumi.cloudflare.PageRuleArgs;
         * import com.pulumi.cloudflare.inputs.PageRuleActionsArgs;
         * import com.pulumi.cloudflare.inputs.PageRuleActionsCacheKeyFieldsArgs;
         * import com.pulumi.cloudflare.inputs.PageRuleActionsCacheKeyFieldsCookieArgs;
         * import com.pulumi.cloudflare.inputs.PageRuleActionsCacheKeyFieldsHeaderArgs;
         * import com.pulumi.cloudflare.inputs.PageRuleActionsCacheKeyFieldsHostArgs;
         * import com.pulumi.cloudflare.inputs.PageRuleActionsCacheKeyFieldsQueryStringArgs;
         * import com.pulumi.cloudflare.inputs.PageRuleActionsCacheKeyFieldsUserArgs;
         * import java.util.List;
         * import java.util.ArrayList;
         * import java.util.Map;
         * import java.io.File;
         * import java.nio.file.Files;
         * import java.nio.file.Paths;
         * 
         * public class App {
         *     public static void main(String[] args) {
         *         Pulumi.run(App::stack);
         *     }
         * 
         *     public static void stack(Context ctx) {
         *         // Unrealistic example with all features used
         *         var foobar = new PageRule("foobar", PageRuleArgs.builder()        
         *             .zoneId(cloudflareZoneId)
         *             .target(String.format("%s/app/*", cloudflareZone))
         *             .priority(1)
         *             .actions(PageRuleActionsArgs.builder()
         *                 .cacheKeyFields(PageRuleActionsCacheKeyFieldsArgs.builder()
         *                     .cookie(PageRuleActionsCacheKeyFieldsCookieArgs.builder()
         *                         .checkPresences("wordpress_test_cookie")
         *                         .build())
         *                     .header(PageRuleActionsCacheKeyFieldsHeaderArgs.builder()
         *                         .checkPresences("header_present")
         *                         .excludes("origin")
         *                         .includes(                        
         *                             "api-key",
         *                             "dnt")
         *                         .build())
         *                     .host(PageRuleActionsCacheKeyFieldsHostArgs.builder()
         *                         .resolved(true)
         *                         .build())
         *                     .queryString(PageRuleActionsCacheKeyFieldsQueryStringArgs.builder()
         *                         .ignore(true)
         *                         .build())
         *                     .user(PageRuleActionsCacheKeyFieldsUserArgs.builder()
         *                         .deviceType(false)
         *                         .geo(true)
         *                         .lang(true)
         *                         .build())
         *                     .build())
         *                 .build())
         *             .build());
         * 
         *     }
         * }
         * }
         * </pre>
         * &lt;!--End PulumiCodeChooser --&gt;
         * 
         * @return builder
         * 
         */
        public Builder lang(Boolean lang) {
            return lang(Output.of(lang));
        }

        public PageRuleActionsCacheKeyFieldsUserArgs build() {
            return $;
        }
    }

}
